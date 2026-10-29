.class public final Lv7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lu7/a;

.field private final b:LF8/I;


# direct methods
.method public constructor <init>(Lu7/a;LF8/I;)V
    .registers 4

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/a;->a:Lu7/a;

    iput-object p2, p0, Lv7/a;->b:LF8/I;

    return-void
.end method


# virtual methods
.method public final a(Lu7/c;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, Lv7/a;->a:Lu7/a;

    invoke-virtual {p0, p1, p2}, Lu7/a;->e(Lu7/c;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final b()LI8/f;
    .registers 1

    iget-object p0, p0, Lv7/a;->a:Lu7/a;

    invoke-virtual {p0}, Lu7/a;->h()LI8/f;

    move-result-object p0

    return-object p0
.end method

.method public final c()Z
    .registers 1

    iget-object p0, p0, Lv7/a;->a:Lu7/a;

    invoke-virtual {p0}, Lu7/a;->f()Z

    move-result p0

    return p0
.end method
