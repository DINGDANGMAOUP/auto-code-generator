package com.kuroneko.auto.code.generator.handler;

import com.kuroneko.auto.code.generator.constants.AutoCodeConstants;
import com.kuroneko.auto.code.generator.pojo.dto.PathDTO;
import java.io.File;

/** @author dzhao1 */
public class PathHandler {

  public static PathDTO build(String projectName) {
    String demoRootPath = AutoCodeConstants.CACHE_PATH + File.separator + projectName;
    projectName = projectName.replaceAll("-", "/");
    String projectDir = AutoCodeConstants.PROJECT_DIR_PREFIX + File.separator + projectName;
    String mainPath = demoRootPath + "/src/main";
    String javaPath = mainPath + "/java" + File.separator + projectDir;
    String staticPath = mainPath + "/resources/static";
    String templatesPath = mainPath + "/resources/templates";
    String testPath = demoRootPath + "/src/test/java" + File.separator + projectDir;
    return PathDTO.builder()
        .projectRootPath(demoRootPath)
        .projectDir(projectDir)
        .mainPath(mainPath)
        .javaPath(javaPath)
        .staticPath(staticPath)
        .templatesPath(templatesPath)
        .testPath(testPath)
        .build();
  }
}
