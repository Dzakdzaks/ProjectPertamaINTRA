package com.dzakdzak.projectpertama;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Makanan extends Fragment {
    String[] listJudulMakanan = {
            "Alpukat",
            "Apel",
            "Durian",
            "Jambu Air",
            "Strawberry"
    };

    Integer[] listGambarMakanan = {
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.durian,
            R.drawable.jambu_air,
            R.drawable.strawberry
    };

    String[] keterangan = {
            "Ini Alpukat",
            "Ini Apel",
            "Ini Durian",
            "Ini Jambu Air",
            "Ini Strawberry"
    };

    ListView listView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_makanan, container, false);
        //kenalkan id ListView
        listView = (ListView) v.findViewById(R.id.listView);

        //panggil class CostumListAdapter tadi
        CostumListAdapter costumListAdapter = new CostumListAdapter(getActivity(), listJudulMakanan, listGambarMakanan);
        listView.setAdapter(costumListAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent bawaData = new Intent(getActivity(),DetailList.class);
                bawaData.putExtra("judul", listJudulMakanan[position]);
                bawaData.putExtra("gambar", listGambarMakanan[position]);
                bawaData.putExtra("keterangan", keterangan[position]);
                startActivity(bawaData);
            }
        });

        return v;
    }

//    private class CostumListAdapter extends ArrayAdapter<String> {
//        private final FragmentActivity context;
//        private final String[] judul;
//        private final Integer[] gambar;
//
//        public CostumListAdapter(FragmentActivity fragment, String[] judulList, Integer[] gambarList){
//            super(fragment,R.layout.list_item);
//            this.context = fragment;
//            this.judul = judulList;
//            this.gambar = gambarList;
//        }
//
//        public View getView (int position, View view, ViewGroup parent){
//
//            LayoutInflater inflater = context.getLayoutInflater();
//            View rowView = inflater.inflate(R.layout.list_item, null,true);
//
//            TextView textList = (TextView)rowView.findViewById(R.id.tv);
//            ImageView imageList = (ImageView)rowView.findViewById(R.id.img);
//
//            textList.setText(judul[position]);
//            imageList.setImageResource(gambar[position]);
//
//            return rowView;
//        }
//    }
}
