.class public final synthetic LG8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:LG8/f;

.field public final synthetic r:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LG8/f;Ljava/lang/Runnable;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG8/e;->q:LG8/f;

    iput-object p2, p0, LG8/e;->r:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, LG8/e;->q:LG8/f;

    iget-object p0, p0, LG8/e;->r:Ljava/lang/Runnable;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p0, p1}, LG8/f;->q1(LG8/f;Ljava/lang/Runnable;Ljava/lang/Throwable;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
