.class public final LF6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE6/b;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LC6/e;)LE6/a;
    .registers 2

    invoke-virtual {p0, p1}, LF6/b;->b(LC6/e;)LF6/a;

    move-result-object p0

    return-object p0
.end method

.method public b(LC6/e;)LF6/a;
    .registers 2

    const-string p0, "effect"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, LF6/a;

    invoke-direct {p0}, LF6/a;-><init>()V

    return-object p0
.end method
