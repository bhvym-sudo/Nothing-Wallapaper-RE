.class public final synthetic LW6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LW6/i;


# direct methods
.method public synthetic constructor <init>(LW6/i;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/g;->q:LW6/i;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LW6/g;->q:LW6/i;

    invoke-static {p0}, LW6/i;->d0(LW6/i;)Landroidx/core/view/W;

    move-result-object p0

    return-object p0
.end method
