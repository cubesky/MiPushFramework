# MiPushFakeFramework

在任何非 MIUI 设备上关闭小米推送。


## 什么是小米推送，为什么会有这个项目

小米推送是小米公司提供的推送服务。其无法被  `MyAndroidTools` 等模块禁用软件关闭（关闭后会在软件打开时重生）。

### 本项目的意义

本项目是为了完全关闭小米推送服务而设计。

其实就是个空包（Orz



###  Others

本项目基于 Trumeet 的 [MiPushFramework](https://github.com/Trumeet/MiPushFramework) 修改，遵循其 GPL v3 协议发布。



## 缺陷

* 不支持 MIUI。


## 开始使用

安装步骤非常简单：

* 前往 Release 标签，下载最新的 Release APK
* 安装到手机
* 启动它
* 强行停止有小米推送的应用。
* 重新打开他们，用 `MyAndroidTools` 等工具观察它们是否已将自身的 `XMPushService` 禁用。如果已禁用，说明小米推送已经被禁止了。



## 反馈问题

如需反馈问题，请务必在 Issues 中带上如下内容：

* 你的 ROM 是什么，Android 版本是什么
* 有没有使用框架等工具

由于其实本身这个软件仅会向推送 SDK 报告系统推送启动，所以应该不会有什么问题....

## 参与项目

欢迎提交 PR、Issues 帮助这个项目更好。


## TODO

- [ ] 缺一个图标

## 感谢

* @Rachel030219 提供文件
* @Trumeet 的 [MiPushFramework](https://github.com/Trumeet/MiPushFramework) 项目

# License

GPL v3，有些狗不遵守开源协议（非本项目），防君子不防小人，请**务必**遵守开源协议！！！
