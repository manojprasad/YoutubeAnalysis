package com.nieslen.youtubetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nieslen.youtubetest.reporting.CreateReportingJob;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateReportingJob reportingJob = new CreateReportingJob();
        reportingJob.main();
    }
}
