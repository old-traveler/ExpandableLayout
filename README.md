# ExpandableLayout
一个折叠布局

![show.gif](https://raw.githubusercontent.com/old-traveler/ExpandableLayout/master/image/show.gif)


```xml
 <declare-styleable name="ExpandableLayout">
    <attr name="maxLine" format="integer" /> //针对于TextView计算折叠高度
    <attr name="collapseHeight" format="dimension" /> //折叠高度
    <attr name="hasAnimation" format="boolean" /> //是否需要动画
    <attr name="animationDuration" format="integer" /> //动画时间
    <attr name="enableCollapseAfterExpand" format="boolean" /> //展开后是否能折叠 为false时展开后不显示折叠按钮 
    <attr name="expendableTriggerId" format="reference" /> //触发折叠控件ViewId
  </declare-styleable>

  <declare-styleable name="SimpleTriggerView">
    <attr name="textSize" format="dimension" />
    <attr name="textColor" format="color" />
    <attr name="icon" format="reference" /> //触发折叠图标
    <attr name="expandText" format="string" />  //展开时显示的文本
    <attr name="collapseText" format="string" /> //折叠时显示的文本
    <attr name="iconColor" format="color" />  //给icon设置颜色
    <attr name="iconSize" format="dimension" /> //设置icon的边长
    <attr name="enableBaseLine" format="boolean" /> //是否与折叠内容底部对齐
    <attr name="textStyle">  //提示文字的字体样式
      <flag name="normal" value="0" />
      <flag name="bold" value="1" />
      <flag name="italic" value="2" />
    </attr>
  </declare-styleable>
```
