# Kotlin DSL & Multiplatform Project

Как оказалось, это не так уж и просто указать все зависимости правильно. Буду учиться..

# Android SDK

Не забываем подключать Android SDK к проекту через файл `<project>/local.properties`:

```
sdk.dir=/Users/user/Library/Android/sdk
```

Иначе все дефолтные библиотеки не будут работать (например, `android.os.Bundle`).