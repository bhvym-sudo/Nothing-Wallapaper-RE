.class public final Lw7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lv7/a;


# direct methods
.method public constructor <init>(Lv7/a;)V
    .registers 3

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/a;->a:Lv7/a;

    return-void
.end method


# virtual methods
.method public final a(Lu7/c;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, Lw7/a;->a:Lv7/a;

    invoke-virtual {p0, p1, p2}, Lv7/a;->a(Lu7/c;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final b()LI8/f;
    .registers 1

    iget-object p0, p0, Lw7/a;->a:Lv7/a;

    invoke-virtual {p0}, Lv7/a;->b()LI8/f;

    move-result-object p0

    return-object p0
.end method

.method public final c()Z
    .registers 1

    iget-object p0, p0, Lw7/a;->a:Lv7/a;

    invoke-virtual {p0}, Lv7/a;->c()Z

    move-result p0

    return p0
.end method
