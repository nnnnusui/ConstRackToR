package com.github.nnnnusui.constracktor

import java.nio.file.{Path, Paths}

class ConstRackToR

object Content{
  val rootPath = Paths.get("memo")
  def apply(path: Path): Content = {
    val file = rootPath.resolve(rootPath)
    val title = path

  }
}
class Content(val path: Path
             ,val properties: Properties
             ,val text: Text)
class Properties
class Text


/*
 * path: ファイルの場所 独立可変
 * fileName: ファイル名 追従可変
 * package: 属する階層 追従可変
 *
 */