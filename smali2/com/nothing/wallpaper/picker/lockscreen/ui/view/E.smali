.class public interface abstract Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(ZLO1/b;LS1/a;Lv8/l;Lv8/a;)V
    .registers 6

    const-string p0, "model"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "clockViewFactory"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onTransitionStart"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onTransitionEnd"

    invoke-static {p5, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract b(Z)V
.end method

.method public c(F)V
    .registers 2

    return-void
.end method

.method public abstract d()V
.end method

.method public e(LA7/a;LN1/a;Lv8/l;Lv8/a;)V
    .registers 5

    const-string p0, "align"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "size"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onTransitionStart"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onTransitionEnd"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract f(F)Landroid/animation/ObjectAnimator;
.end method

.method public g(Ljava/util/List;ILS1/a;)V
    .registers 4

    const-string p0, "clocks"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "clockViewFactory"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract getClockView()Landroid/view/View;
.end method

.method public getIndicator()Landroid/view/View;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public abstract getView()Landroid/view/View;
.end method

.method public h(F)V
    .registers 2

    return-void
.end method

.method public i(LN1/a;LA7/a;Lv8/l;Lv8/a;Lv8/a;)V
    .registers 6

    const-string p0, "size"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "align"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onClockSizeChanged"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onTransitionStart"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "onTransitionEnd"

    invoke-static {p5, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract setOnClockChangedListener(Lv8/l;)V
.end method
