package MyServlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * Created by 纪雷 on 2019/5/11.
 */
@WebServlet(name = "VerifyCodeServlet",urlPatterns = "/code")
public class VerifyCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          int width=80;
          int height=30;

          String data="abcdefghijklmnopqrstuvwxyz0123456789QWERTYUIOPLKJHGFDSAZXCVBNM";
        Random random=new Random();
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.gray);
        graphics.fillRect(0,0,width,height);
        graphics.setColor(Color.black);
        for (int i = 0; i < 4; i++) {
            int adr=random.nextInt(data.length());
            String substring = data.substring(adr,adr+1);
            graphics.drawString(substring,width/5*(i+1),18);
        }
        ImageIO.write(image,"jpg",response.getOutputStream());
    }
}
