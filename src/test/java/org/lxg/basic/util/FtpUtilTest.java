package org.lxg.basic.util;

import com.jcraft.jsch.SftpException;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author: xuegangliu
 * @date: 8/14/2018 6:16 PM
 * @DES:
 * @version: v1.0
 */
public class FtpUtilTest {

    @Test
    public void ftpTest(){
        try {
            FileInputStream in=new FileInputStream(new File("D:\\test.txt"));
            boolean flag = FtpUtil.uploadFile("xx.xx.xx.xx", 21, "xx", "xx", "/opt","/", "test1.txt", in);
            System.out.println(flag);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sftpTest(){
        SFTPUtil sftp = new SFTPUtil("root", "xx.xx.xx.xx", 22, "c:\\Users\\Administrator\\.ssh\\id_rsa") ;
//        SFTPUtil sftp = new SFTPUtil("xx", "xx", "xx.xx.xx.xx", 22);
        sftp.login();
        File file = new File("D:\\test.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            try {
                sftp.upload("/","/test", "test_sftp1.test", is);
            } catch (SftpException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sftp.logout();
    }
}