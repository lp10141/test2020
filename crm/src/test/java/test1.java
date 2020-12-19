import com.bjpowernode.crm.utils.DateTimeUtil;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;


public class test1 {

    @Test
    public static void main(String[] args) {

        //验证失效时间
        /*String expireTime = "2020-10-10 10:10:10";

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(date);
        //当前系统时间
        String currentTime = DateTimeUtil.getSysTime();

        int count = expireTime.compareTo(currentTime);
        System.out.println(count);*/

        String lockState = "0";
        if ("0".equals(lockState)){
            System.out.println("账号已锁定");
        }

    }
}
