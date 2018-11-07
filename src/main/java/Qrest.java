/**
 * Created with IntelliJ IDEA.
 * User: kongxiaoping
 * Date: 2018/4/18
 * Time: 16:37
 * Description: No Description
 */
import java.io.File;
import java.io.IOException;

import com.google.zxing.WriterException;

public class Qrest {

    public static void main(String[] args) {

        String content="coupon_id=3";
//        String logUri="G:\\testImages\\下载.jpg";
        String outFileUri="G:\\二维码test.png";

        String logUri ="G:\\images.jpg";
        int[]  size=new int[]{430,430};
        String format = "jpg";

        try {
            //无logo二维码
//            new QRCodeFactory().CreatQrImage(content, format, outFileUri, size);
            //有logo二维码
            new QRCodeFactory().CreatQrImageAndLogo(content, format, outFileUri,logUri, size);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (WriterException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
