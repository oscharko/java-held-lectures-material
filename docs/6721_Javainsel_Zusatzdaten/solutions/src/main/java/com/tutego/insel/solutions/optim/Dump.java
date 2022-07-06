//package com.tutego.insel.solutions.optim;
//import org.objectweb.asm.*;
//import java.io.FileOutputStream;
//
//public class Dump implements Constants {
//
//	public static void main(String[] args) throws Exception
//	{
//		int[] feld = { 12, 34, 45,23,5,2365,23,512,13,54,235,34,4}; 
//
//		mittel( feld );
//	}
//
//	public static void mittel(int[] args) throws Exception {
//
//		ClassWriter cw = new ClassWriter(false);
//		CodeVisitor cv;
//
//		cw.visit(46, ACC_PUBLIC + ACC_SUPER, "Mittelwertbilder",
//				"java/lang/Object", null, "Mittelwertbilder.java");
//
//		{
//			cv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
//			cv.visitVarInsn(ALOAD, 0);
//			cv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>",
//					"()V");
//			cv.visitInsn(RETURN);
//			cv.visitMaxs(1, 1);
//		}
//		{
//			cv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "mittel", "()I", null,
//					null);
//			cv.visitInsn(ICONST_0);
//			cv.visitVarInsn(ISTORE, 0);
//			
//			//
//
//			for (int i = 0; i < args.length; i++)
//			{
//				cv.visitIincInsn(0,  args[i] );
//			}
//
//			//
//
//			cv.visitVarInsn(ILOAD, 0);
//			cv.visitIntInsn(BIPUSH, args.length );
//			cv.visitInsn(IDIV);
//			cv.visitVarInsn(ISTORE, 0);
//			cv.visitVarInsn(ILOAD, 0);
//			cv.visitInsn(IRETURN);
//			cv.visitMaxs(2, 1);
//		}
//		cw.visitEnd();
//
//		FileOutputStream os = new FileOutputStream("Mittelwertbilder.class");
//		os.write(cw.toByteArray());
//		os.close();
//	}
//}