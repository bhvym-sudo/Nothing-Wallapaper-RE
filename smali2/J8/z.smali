.class public final LJ8/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# instance fields
.field private final q:LH8/w;


# direct methods
.method public constructor <init>(LH8/w;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ8/z;->q:LH8/w;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LJ8/z;->q:LH8/w;

    invoke-interface {p0, p1, p2}, LH8/w;->n(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_d

    return-object p0

    :cond_d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
