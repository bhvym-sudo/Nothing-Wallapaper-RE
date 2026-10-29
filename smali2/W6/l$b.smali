.class public final LW6/l$b;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/l;->g(Le3/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LW6/l;


# direct methods
.method constructor <init>(LW6/l;)V
    .registers 2

    iput-object p1, p0, LW6/l$b;->a:LW6/l;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 4

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LW6/l$b;->a:LW6/l;

    sget-object v0, Li6/l;->a:Li6/l;

    invoke-static {p1}, LW6/l;->c(LW6/l;)Landroid/content/Context;

    move-result-object v1

    iget-object p0, p0, LW6/l$b;->a:LW6/l;

    invoke-static {p0}, LW6/l;->c(LW6/l;)Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, LH6/a;->b(Landroid/content/Context;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-virtual {v0, v1, p0}, Li6/l;->e(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, LW6/l;->e(LW6/l;Ljava/lang/String;)V

    return-void
.end method
