Это multiplatform библиотека. Здесь будет код для:

- чистой java (target = jvm)
- андроид (target = android)
- веб (target = ?)

Насчет SourceSet: я не знаю, как определять свои SourceSet, так что лучше использовать директории по-умолчанию:

- androidMain (sourceSet "main")
- androidTest (sourceSet "test")
- commonMain (sourceSet "main")
- commonTest (sourceSet "test")
- jvmMain (sourceSet "main")
- jvmTest (sourceSet "test")
- ...

Посмотреть их можно, если в модуле начать добавлять папку, Idea предложит вам список SourceSet'ов, в которых можно добавить директорию.

Обязательно надо проставлять все SourceSets: без этого ничего не будет добавлено в JAR'ник итоговый!


# About Kotlin for Server Side

Link: https://kotlinlang.org/docs/server-overview.html
