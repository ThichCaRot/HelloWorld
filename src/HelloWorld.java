//import org.opencv.core.Core;
//import org.opencv.core.CvType;
//import org.opencv.core.Mat;
//
//public class HelloWorld {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//		Mat mat = Mat.eye(3, 3, CvType.CV_8UC2);
//		System.out.println(mat.dump());
//	}
//
//}
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

public class HelloWorld {

	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		String filePath = "src/cat.jpg";
		Mat originalImage = Imgcodecs.imread(filePath);
		if(originalImage.dataAddr()==0){
			System.out.println("Couldn't open file " + filePath);
		} else {
			HighGui.namedWindow("image");
			HighGui.imshow("image",originalImage);
			HighGui.waitKey();
		}
	}

}
