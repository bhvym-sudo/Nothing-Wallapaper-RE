.class public final Lu7/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu7/a;->h()LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:LI8/f;

.field final synthetic r:Lu7/a;


# direct methods
.method public constructor <init>(LI8/f;Lu7/a;)V
    .registers 3

    iput-object p1, p0, Lu7/a$e;->q:LI8/f;

    iput-object p2, p0, Lu7/a$e;->r:Lu7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 5

    iget-object v0, p0, Lu7/a$e;->q:LI8/f;

    new-instance v1, Lu7/a$e$a;

    iget-object p0, p0, Lu7/a$e;->r:Lu7/a;

    invoke-direct {v1, p1, p0}, Lu7/a$e$a;-><init>(LI8/g;Lu7/a;)V

    invoke-interface {v0, v1, p2}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_14

    return-object p0

    :cond_14
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
