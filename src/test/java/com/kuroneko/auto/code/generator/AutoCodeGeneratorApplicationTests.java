package com.kuroneko.auto.code.generator;

import com.kuroneko.auto.code.generator.model.MysqlTableInfo;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.File;
import java.io.IOException;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

@SpringBootTest
@Slf4j
class AutoCodeGeneratorApplicationTests {
    @Resource
    Configuration configuration;

    @Test
    void mk() throws IOException, TemplateException {
        MysqlTableInfo mysqlTableInfo = new MysqlTableInfo();
        Template template = configuration.getTemplate("pom/pom.ftl");
        String s = FreeMarkerTemplateUtils.processTemplateIntoString(template, mysqlTableInfo);
        File file = new File(template.getName() + "1.java");
        log.info(template.getSourceName());
        FileUtils.touch(file);
        FileUtils.writeStringToFile(file, s, "UTF-8");

    }
    @Test
    void contextLoads() {
        String[] DIRECTORY_STRUCTURE={"src",""};
        //当前项目根目录
        String property = System.getProperty("user.dir");
        String temp="temp";
        String src="src";
        String main="main";
        String test="test";
        log.info(property);
        //包名
        String  pkg="com.yinlu.wx.mp";
        String  demoName="example";
        String separator = File.separator;
        String pkgPath = pkg.replaceAll("\\.", "/");
        String mainPath=property+separator+temp+separator+demoName+separator+src+separator+main;
        String testPath=property+separator+temp+separator+demoName+separator+src+separator+test;
        String demoMainPath=mainPath+separator+"java"+separator+pkgPath;
        String demoResPath=mainPath+separator+"resources";
        String demoTestPath=testPath+separator+"java"+separator+pkgPath;
        new File(demoMainPath).mkdirs();
        new File(demoTestPath).mkdirs();
        new File(demoResPath).mkdirs();
        log.info(demoMainPath);
        log.info(demoTestPath);
        log.info(demoResPath);

    }

}
