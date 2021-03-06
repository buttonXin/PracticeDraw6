
- 属性动画
```
 imageView.animate()
          .translationX(Utils.dpToPixel(150))
          .setDuration(600)
          ...

          这个就是属性动画，
          进行延伸，可以做全屏扩散 ， 如下

点击扩散，然后跳转， 最后缩放到原来的位置。
private void scale(final View view) {
        view.animate()
                .scaleX(10)
                .scaleY(10)
                .setDuration(500)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {

                        startActivity(new Intent(getApplicationContext(), ScaleActivity2.class));

                        view.animate()
                                .scaleY(1)
                                .scaleX(1)
                                .setDuration(500)
                                .setListener(new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {

                                        view.animate().cancel();
                                    }
                                });

                    }
                });
    }

然后将view 的shape设置成圆形的  这样点击就会有扩散全屏跳转的效果！！！

```

![](images/icon.png)

HenCoder 绘制 6 属性动画 练习项目
===

### 这是什么？

这不是一个独立使用的项目，它是 [HenCoder Android 开发进阶：UI 1-6 属性动画（上手篇）](http://hencoder.com/ui-1-6) 的配套练习项目。

### 怎么用？

项目是一个可以直接运行的 Android App 项目，项目运行后，在手机上打开是这样的：

![](images/preview.png)

工程下有一个 `/practice` 目录：

![](images/project_practice.png)

你要做的是就是，在 `/practice` 下的每一个 `PracticeXxxView.java` 文件中写代码，绘制出和页面上半部分相同的效果。就像这样：

![](images/preview_after.png)

> 当然，没必要做得和示例一毛一样。这是一个练习，而不是一个超级模仿秀，关键是把技能掌握。

如果做不出来，可以参考 `/sample` 目录下的代码：

![](images/project_sample.png)

练习做完，这期的内容也就掌握得差不多了。