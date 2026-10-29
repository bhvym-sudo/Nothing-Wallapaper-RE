.class public final Lr6/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr6/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lr6/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/ComponentName;Landroid/view/View;Landroid/content/Context;ILv8/a;)Lr6/g;
    .registers 12

    const-string p0, "componentName"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "context"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-string p0, "android.service.wallpaper.WallpaperService"

    invoke-direct {v1, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p0, p1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    new-instance v4, Lr6/g$a$a;

    invoke-direct {v4, p5}, Lr6/g$a$a;-><init>(Lv8/a;)V

    new-instance v0, Lr6/g;

    move-object v3, p2

    move-object v2, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lr6/g;-><init>(Landroid/content/Intent;Landroid/content/Context;Landroid/view/View;LH3/C$c;I)V

    return-object v0
.end method
