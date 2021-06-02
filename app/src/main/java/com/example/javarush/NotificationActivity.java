package com.example.javarush;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NotificationActivity extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_notification, container, false);
    }
//        // идентификатор нашего уведомления
//    private int NOTIFICATION_ID = 1010;
//    private NotificationManager notificationManager;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_notification);
//        Button btnCreate = (Button) findViewById(R.id.btn_create_notification);
//        Button btnCancel = (Button) findViewById(R.id.btn_cancel_notification);
//
//        btnCreate.setOnClickListener(this);
//        btnCancel.setOnClickListener(this);
//
//    }
//    public void createNotification(String url) {
//        // инициализируем интерфейс NotificationCompat.Builder
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
//        builder.setSmallIcon(android.R.drawable.ic_dialog_alert);
//
//        // создаем Intent с действием на просмотр веб-страниц
//        // и явно указываем какую ссылку мы хотим открыть
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
//
//        // устанавливаем объект PendingIntent, большую иконку, заголовки и контент
//        builder.setContentIntent(pendingIntent);
//        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
//        builder.setContentTitle("Это заголовок");
//        builder.setContentText("Это контент нашего уведомления");
//        builder.setSubText("Действие: нажмите на уведомление, чтобы открыть сайт");
//
//        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//
//        // отображаем объект Notification в панели уведомлений
//        notificationManager.notify(NOTIFICATION_ID, builder.build());
//    }
//
//    public void cancelNotification() {
//        // получаем из контекста сервис уведомлений и отменяем уведомление по его Id
//        notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
//        notificationManager.cancel(NOTIFICATION_ID);
//    }
//
//    @Override
//    public void onClick(View view) {
//        int id = view.getId();
//        switch (id) {
//            case R.id.btn_create_notification: {
//                // задаем ссылку, которая будет
//                // открываться по нажатию на уведомление
//                createNotification("https://javadevblog.com");
//                break;
//            }
//            case R.id.btn_cancel_notification: {
//                cancelNotification();
//                break;
//            }
//        }
//    }
}
