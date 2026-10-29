.class public final LH7/d$a;
.super Lcom/nothing/cardhost/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/nothing/cardhost/f;-><init>(Landroid/content/Context;ILv5/a;ILkotlin/jvm/internal/h;)V

    return-void
.end method


# virtual methods
.method public U(Landroid/content/Context;ILF5/m;Z)Lcom/nothing/cardhost/g;
    .registers 5

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, LH7/d$b;

    invoke-direct {p0, p1}, LH7/d$b;-><init>(Landroid/content/Context;)V

    return-object p0
.end method
