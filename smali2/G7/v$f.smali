.class public final LG7/v$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/v;->s(Landroid/app/Activity;Lg3/x;Landroid/widget/ImageView;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/android/wallpaper/asset/a;

.field final synthetic c:Landroid/widget/ImageView;

.field final synthetic d:Z

.field final synthetic e:Z

.field final synthetic f:Lcom/android/wallpaper/asset/a$f;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/android/wallpaper/asset/a;Landroid/widget/ImageView;ZZLcom/android/wallpaper/asset/a$f;)V
    .registers 7

    iput-object p1, p0, LG7/v$f;->a:Landroid/app/Activity;

    iput-object p2, p0, LG7/v$f;->b:Lcom/android/wallpaper/asset/a;

    iput-object p3, p0, LG7/v$f;->c:Landroid/widget/ImageView;

    iput-boolean p4, p0, LG7/v$f;->d:Z

    iput-boolean p5, p0, LG7/v$f;->e:Z

    iput-object p6, p0, LG7/v$f;->f:Lcom/android/wallpaper/asset/a$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 11

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    move-object p1, p0

    new-instance p0, Lcom/android/wallpaper/asset/d;

    iget-object p2, p1, LG7/v$f;->a:Landroid/app/Activity;

    iget-object p3, p1, LG7/v$f;->b:Lcom/android/wallpaper/asset/a;

    invoke-direct {p0, p2, p3}, Lcom/android/wallpaper/asset/d;-><init>(Landroid/content/Context;Lcom/android/wallpaper/asset/a;)V

    move-object p2, p1

    iget-object p1, p2, LG7/v$f;->a:Landroid/app/Activity;

    move-object p3, p2

    iget-object p2, p3, LG7/v$f;->c:Landroid/widget/ImageView;

    move-object p4, p3

    invoke-static {p1}, LG6/e;->f(Landroid/content/Context;)I

    move-result p3

    iget-object p5, p4, LG7/v$f;->b:Lcom/android/wallpaper/asset/a;

    instance-of p5, p5, Lcom/android/wallpaper/asset/h;

    if-eqz p5, :cond_25

    iget-boolean p5, p4, LG7/v$f;->d:Z

    if-eqz p5, :cond_23

    goto :goto_25

    :cond_23
    const/4 p5, 0x0

    goto :goto_26

    :cond_25
    :goto_25
    const/4 p5, 0x1

    :goto_26
    iget-boolean p6, p4, LG7/v$f;->e:Z

    iget-object p4, p4, LG7/v$f;->f:Lcom/android/wallpaper/asset/a$f;

    move v0, p6

    move-object p6, p4

    move p4, p5

    move p5, v0

    invoke-virtual/range {p0 .. p6}, Lcom/android/wallpaper/asset/a;->s(Landroid/app/Activity;Landroid/widget/ImageView;IZZLcom/android/wallpaper/asset/a$f;)V

    return-void
.end method
