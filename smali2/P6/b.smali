.class public final synthetic LP6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LP6/b;->q:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-boolean p0, p0, LP6/b;->q:Z

    invoke-static {p0}, LP6/a$c;->e(Z)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method
