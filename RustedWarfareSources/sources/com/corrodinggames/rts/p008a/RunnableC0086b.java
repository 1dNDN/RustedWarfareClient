package com.corrodinggames.rts.p008a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/* renamed from: com.corrodinggames.rts.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/b.class */
public class RunnableC0086b implements Runnable {

    /* renamed from: a */
    Socket f418a;

    /* renamed from: b */
    final /* synthetic */ RunnableC0069a f419b;

    public RunnableC0086b(RunnableC0069a runnableC0069a, Socket socket) {
        this.f419b = runnableC0069a;
        this.f418a = socket;
    }

    @Override // java.lang.Runnable
    public void run() {
        String readLine;
        try {
            try {
                PrintWriter printWriter = new PrintWriter(this.f418a.getOutputStream(), true);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f418a.getInputStream()));
                while (this.f419b.f387b && (readLine = bufferedReader.readLine()) != null) {
                    printWriter.print(RunnableC0069a.m4858b(readLine));
                    printWriter.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    this.f418a.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } finally {
            try {
                this.f418a.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }
}
