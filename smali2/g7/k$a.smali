.class public final Lg7/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/k;
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
    invoke-direct {p0}, Lg7/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZLjava/lang/CharSequence;)Landroidx/fragment/app/q;
    .registers 4

    const-string p0, "toolbarTitle"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lg7/k;

    invoke-direct {p0}, Lg7/k;-><init>()V

    invoke-static {p2}, Lg7/k;->b1(Ljava/lang/CharSequence;)Landroid/os/Bundle;

    move-result-object p2

    const-string v0, "start_from_lock_screen"

    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {p0, p2}, Landroidx/fragment/app/q;->setArguments(Landroid/os/Bundle;)V

    return-object p0
.end method
