當前例子存在的意義，是為了說明“application.properties”文件的讀取順序和位置
也就是相同文件在不同路徑下的優先級
第一位是工程根目錄下的config文件夾
第二位是工程根目錄
第三位是classpath根目錄下的config文件夾
第四位是classpath的根目錄

下面說的是在同一路徑下的不同類型配置文件優先級：
第一位是application.properties
第二位是application.yml
第三位是abc.properties