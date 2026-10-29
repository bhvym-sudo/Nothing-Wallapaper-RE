.class public final LK6/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK6/c;->d0(Lb/j;)LS1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LK6/c;


# direct methods
.method constructor <init>(LK6/c;)V
    .registers 2

    iput-object p1, p0, LK6/c$a;->q:LK6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDestroy(Landroidx/lifecycle/x;)V
    .registers 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/h;->onDestroy(Landroidx/lifecycle/x;)V

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p1

    if-eqz p1, :cond_11

    goto :goto_1c

    :cond_11
    iget-object p0, p0, LK6/c$a;->q:LK6/c;

    invoke-static {p0}, LK6/c;->G0(LK6/c;)LS1/a;

    move-result-object p0

    if-eqz p0, :cond_1c

    invoke-interface {p0}, LS1/a;->onDestroy()V

    :cond_1c
    :goto_1c
    return-void
.end method
