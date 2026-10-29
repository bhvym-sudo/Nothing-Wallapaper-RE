.class public final LU8/g$b;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU8/g;-><init>(LT8/e;IJLjava/util/concurrent/TimeUnit;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LU8/g;


# direct methods
.method constructor <init>(LU8/g;Ljava/lang/String;)V
    .registers 5

    iput-object p1, p0, LU8/g$b;->e:LU8/g;

    const/4 p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p2, v1, p1, v0}, LT8/a;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/h;)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 3

    iget-object p0, p0, LU8/g$b;->e:LU8/g;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LU8/g;->b(J)J

    move-result-wide v0

    return-wide v0
.end method
