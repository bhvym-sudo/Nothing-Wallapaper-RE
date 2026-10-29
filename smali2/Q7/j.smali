.class public final synthetic LQ7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LQ7/s;


# direct methods
.method public synthetic constructor <init>(LQ7/s;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ7/j;->q:LQ7/s;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LQ7/j;->q:LQ7/s;

    invoke-static {p0}, LQ7/s;->a(LQ7/s;)LQ7/s$b;

    move-result-object p0

    return-object p0
.end method
