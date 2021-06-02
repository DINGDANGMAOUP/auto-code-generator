package com.kuroneko.auto.code.generator.handler.directory;

import com.kuroneko.auto.code.generator.constants.AutoCodeConstants;
import com.kuroneko.auto.code.generator.constants.ProjectConstants;
import com.kuroneko.auto.code.generator.pojo.dto.PathDTO;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.BeanUtils;

/**
 * 初始化project目录
 * @author dzhao1
 */
public class InitDirHandler {
  public static void init(PathDTO pathDTO)  {
    String[] dirArr={pathDTO.getJavaPath(),pathDTO.getStaticPath(),pathDTO.getTemplatesPath(),pathDTO.getTestPath()};
    for (String dir : dirArr) {
      new File(dir).mkdirs();
    }
  }


}
