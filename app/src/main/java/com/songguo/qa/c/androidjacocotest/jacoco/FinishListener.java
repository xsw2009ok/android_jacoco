package com.songguo.qa.c.androidjacocotest.jacoco;

public interface FinishListener {
    void onActivityFinished();
    void dumpIntermediateCoverage(String filePath);
}