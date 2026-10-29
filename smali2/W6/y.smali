.class public final synthetic LW6/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LW6/U;


# direct methods
.method public synthetic constructor <init>(LW6/U;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/y;->q:LW6/U;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LW6/y;->q:LW6/U;

    invoke-static {p0}, LW6/U;->T0(LW6/U;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
