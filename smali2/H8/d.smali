.class public final synthetic LH8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# instance fields
.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:LH8/e;

.field public final synthetic s:LN8/k;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LH8/e;LN8/k;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH8/d;->q:Ljava/lang/Object;

    iput-object p2, p0, LH8/d;->r:LH8/e;

    iput-object p3, p0, LH8/d;->s:LN8/k;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 10

    iget-object v0, p0, LH8/d;->q:Ljava/lang/Object;

    iget-object v1, p0, LH8/d;->r:LH8/e;

    iget-object v2, p0, LH8/d;->s:LN8/k;

    move-object v3, p1

    check-cast v3, Ljava/lang/Throwable;

    move-object v5, p3

    check-cast v5, Lm8/i;

    move-object v4, p2

    invoke-static/range {v0 .. v5}, LH8/e;->a(Ljava/lang/Object;LH8/e;LN8/k;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
