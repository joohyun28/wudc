package com.android.onapplication;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class AudioAdapter extends MainActivity {

    /**
     * 커스텀 이벤트 리스너
     * 클릭이벤트를 Adapter에서 구현하기에 제약이 있기 때문에 Activity 에서 실행시키기 위해 커스텀 이벤트 리스너를 생성함.
     * 절차
     * 1.커스텀 리스너 인터페이스 정의
     * 2. 리스너 객체를 전달하는 메서드와 전달된 객체를 저장할변수 추가
     * 3. 아이템 클릭 이벤트 핸들러 메스드에서 리스너 객체 메서드 호출
     * 4. 액티비티에서 커스텀 리스너 객체 생성 및 전달(MainActivity.java 에서 audioAdapter.setOnItemClickListener() )
     */


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //자신이 만든 itemview를 inflate한 다음 뷰홀더 생성
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recordsave,parent,  false);
        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageButton audioBtn;
        TextView audioTitle;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            audioBtn.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //3. 아이템 클릭 이벤트 핸들러 메스드에서 리스너 객체 메서드 호출
                    int pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION) {
                    }
                }
            });
        }
    }
}
