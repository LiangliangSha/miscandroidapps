package com.geolo.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class DemoListHeaderView extends LinearLayout {
	
	private Context context;
	private Spinner mSpinner;
	private static final String[] m_Countries = { "O��", "A��", "B��", "AB��", "����" };
	private ArrayAdapter<String>	adapter;
	public DemoListHeaderView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initialize(context);
	}

	public DemoListHeaderView(Context context) {
		super(context);
		initialize(context);
	}

	private void initialize(Context context) {
		this.context = context;
		View view = LayoutInflater.from(this.context).inflate(R.layout.list_spinner, null);
		mSpinner = (Spinner)view.findViewById(R.id.Spinner1);
		//����ѡ������ArrayAdapter����
		adapter = new ArrayAdapter<String>(this.context, android.R.layout.simple_spinner_item, m_Countries);
		//���������б�ķ��
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		//��adapter��ӵ�m_Spinner��
		mSpinner.setAdapter(adapter);
		addView(view);
	}
}