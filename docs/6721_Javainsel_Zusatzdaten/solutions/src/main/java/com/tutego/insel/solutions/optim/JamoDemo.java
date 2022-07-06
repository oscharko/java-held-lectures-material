//package com.tutego.insel.solutions.optim;
//
//import javax.swing.JFrame;
//
//import com.jamonapi.Monitor;
//import com.jamonapi.MonitorFactory;
//
//public class JamoDemo extends JFrame {
//
//    private static final int INNER_ITERATION = 1000;
//    private static final int OUTER_ITERATION = 100;
//    
//    public static void main(String[] args) {
//
//        System.out.println("forPlus       : " + forPlus());
//        System.out.println("forBuilder    : " + forBuilder());
//        System.out.println("forBuffer     : " + forBuffer());
//        System.out.println("forBufferInit : " + forBufferInitialized());
//
//    }
//
//    public static Monitor forBuilder() {
//
//        Monitor mon = null;
//
//        for (int i = 0; i < OUTER_ITERATION; i++) {
//
//            mon = MonitorFactory.start("builder");
//
//            for (int j = 0; j < INNER_ITERATION; j++) {
//
//                StringBuilder sb = new StringBuilder(26);
//
//                for (char c = 'a'; c <= 'z'; ++c) {
//
//                    sb.append(c);
//
//                }
//
//            }
//
//            mon.stop();
//
//        }
//
//        return mon;
//    }
//
//    public static Monitor forBuffer() {
//
//        Monitor mon = null;
//
//        for (int i = 0; i < OUTER_ITERATION; i++) {
//
//            mon = MonitorFactory.start("buffer");
//
//            for (int j = 0; j < INNER_ITERATION; j++) {
//
//                StringBuffer sb = new StringBuffer();
//
//                for (char c = 'a'; c <= 'z'; ++c) {
//
//                    sb.append(c);
//
//                }
//
//            }
//
//            mon.stop();
//
//        }
//
//        return mon;
//    }
//
//    public static Monitor forBufferInitialized() {
//
//        Monitor mon = null;
//
//        for (int i = 0; i < OUTER_ITERATION; i++) {
//
//            mon = MonitorFactory.start("bufferInitialized");
//
//            for (int j = 0; j < INNER_ITERATION; j++) {
//
//                StringBuffer sb = new StringBuffer(26);
//
//                for (char c = 'a'; c <= 'z'; ++c) {
//
//                    sb.append(c);
//
//                }
//
//            }
//
//            mon.stop();
//
//        }
//
//        return mon;
//    }
//
//    public static Monitor forPlus() {
//
//        Monitor mon = null;
//
//        for (int i = 0; i < OUTER_ITERATION; i++) {
//
//            mon = MonitorFactory.start("plus");
//
//            for (int j = 0; j < INNER_ITERATION; j++) {
//
//                String s = "";
//
//                for (char c = 'a'; c <= 'z'; ++c) {
//
//                    s += c;
//
//                }
//
//            }
//
//            mon.stop();
//
//        }
//
//        return mon;
//
//    }
//
//}