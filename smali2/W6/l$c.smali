.class public final LW6/l$c;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/l;->h(Le3/m;)V
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

    iput-object p1, p0, LW6/l$c;->a:LW6/l;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 3

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LW6/l$c;->a:LW6/l;

    sget-object p1, Li6/l;->a:Li6/l;

    invoke-static {p0}, LW6/l;->c(LW6/l;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Li6/l;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LW6/l;->e(LW6/l;Ljava/lang/String;)V

    return-void
.end method
