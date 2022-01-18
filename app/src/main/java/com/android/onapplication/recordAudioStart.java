package com.android.onapplication;

import android.media.MediaRecorder;
import android.util.Log;

import java.io.IOException;

public class recordAudioStart {

    // 녹음 시작
    private void startRecording() {
        Log.d(TAG, getClass().getSimpleName().trim()+"_"+new Object() {}.getClass().getEnclosingMethod().getName()+"() | 오디오 녹화 시작" );

        //파일의 외부 경로 확인
        String recordPath = getExternalFilesDir("/").getAbsolutePath();
        Log.d(TAG, getClass().getSimpleName().trim()+"_"+new Object() {}.getClass().getEnclosingMethod().getName()+"() | 외부 경로:  "+ recordPath);

        //Media Recorder 생성 및 설정
        MediaRecorder mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

        try {
            Log.d(TAG, getClass().getSimpleName().trim()+"_"+new Object() {}.getClass().getEnclosingMethod().getName()+"() | prepare 시작 " );
            mediaRecorder.prepare();
        } catch (IOException e) {
            Log.d(TAG, getClass().getSimpleName().trim()+"_"+new Object() {}.getClass().getEnclosingMethod().getName()+"() | 예외 발생 : "+e);
            e.printStackTrace();
        }
        //녹음 시작
        mediaRecorder.start();
        Log.d(TAG, getClass().getSimpleName().trim()+"_"+new Object() {}.getClass().getEnclosingMethod().getName()+"() | 녹음 시작 " );
    }

}

