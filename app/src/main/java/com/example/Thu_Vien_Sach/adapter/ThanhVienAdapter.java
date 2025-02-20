package com.example.Thu_Vien_Sach.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.Thu_Vien_Sach.R;
import com.example.Thu_Vien_Sach.model.ThanhVien;

import java.util.List;

public class ThanhVienAdapter extends ArrayAdapter<ThanhVien> {
    private Context context;
    private int resource;
    private List<ThanhVien> objects;
    private LayoutInflater inflater;

    public ThanhVienAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView==null){
            convertView = inflater.inflate(R.layout.item_lv_addtv,null);
            holder.tvmatv = (TextView)convertView.findViewById(R.id.item_lv_username);
            holder.tvtentv = (TextView)convertView.findViewById(R.id.item_lv_name);
            holder.tvnamsinhtv = (TextView)convertView.findViewById(R.id.item_lv_pass);
            holder.tvcccd = (TextView)convertView.findViewById(R.id.item_lv_cccd);

            holder.temp1 = (TextView)convertView.findViewById(R.id.temp_1);
            holder.temp2 = (TextView)convertView.findViewById(R.id.temp_2);
            holder.temp3 = (TextView)convertView.findViewById(R.id.temp_3);
            holder.temp4 = (TextView)convertView.findViewById(R.id.temp_4);

            convertView.setTag(holder);
        }else{
            holder =(ViewHolder) convertView.getTag();
        }
        ThanhVien tv = objects.get(position);
        holder.tvmatv.setText(String.valueOf(tv.maTV));
        holder.tvtentv.setText(tv.hoTen);
        holder.tvnamsinhtv.setText(tv.namSinh);
        holder.tvcccd.setText(tv.cccd);

        holder.temp1.setText("Mã Thành Viên: ");
        holder.temp2.setText("Tên Thành Viên: ");
        holder.temp3.setText("Năm Sinh: ");
        holder.temp4.setText("CCCD: ");

        return convertView;
    }

    public class ViewHolder{
        TextView tvmatv,tvtentv,tvnamsinhtv, tvcccd, temp1,temp2,temp3 ,temp4;
    }
}
