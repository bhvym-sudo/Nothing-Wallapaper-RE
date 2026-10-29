.class final LH8/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/r;->a(LH8/t;Lv8/a;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:LF8/l;


# direct methods
.method constructor <init>(LF8/l;)V
    .registers 2

    iput-object p1, p0, LH8/r$b;->q:LF8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .registers 2

    iget-object p0, p0, LH8/r$b;->q:LF8/l;

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LH8/r$b;->a(Ljava/lang/Throwable;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
