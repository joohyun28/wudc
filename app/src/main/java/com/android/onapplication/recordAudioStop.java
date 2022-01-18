package com.android.onapplication;

public class recordAudioStop {
    // 녹음 종료
    private void stopRecording() {
        Log.d(TAG, getClass().getSimpleName().trim()+"_"+new Object() {}.getClass().getEnclosingMethod().getName()+"() | " );
        // 녹음 종료 종료
        mediaRecorder.stop();
        mediaRecorder.release();
        mediaRecorder = null;

        // 파일 경로(String) 값을 Uri로 변환해서 저장
        //      - Why? : 리사이클러뷰에 들어가는 ArrayList가 Uri를 가지기 때문
        //      - File Path를 알면 File을  인스턴스를 만들어 사용할 수 있기 때문
        audioUri = Uri.parse(audioFileName);
        Log.d(TAG, getClass().getSimpleName().trim()+"_"+new Object() {}.getClass().getEnclosingMethod().getName()+"() | audioUri : "+audioUri );


        // 데이터 ArrayList에 담기
        audioList.add(audioUri);
        Log.d(TAG, getClass().getSimpleName().trim()+"_"+new Object() {}.getClass().getEnclosingMethod().getName()+"() | audioList.size() "+audioList.size());


        // 데이터 갱신
        audioAdapter.notifyDataSetChanged();

    }

}
