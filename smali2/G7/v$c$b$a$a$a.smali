.class public final LG7/v$c$b$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/v$c$b$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Ls6/i;

.field final synthetic r:Landroidx/cardview/widget/CardView;


# direct methods
.method constructor <init>(Ls6/i;Landroidx/cardview/widget/CardView;)V
    .registers 3

    iput-object p1, p0, LG7/v$c$b$a$a$a;->q:Ls6/i;

    iput-object p2, p0, LG7/v$c$b$a$a$a;->r:Landroidx/cardview/widget/CardView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .registers 3

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LG7/v$c$b$a$a$a;->q:Ls6/i;

    invoke-interface {p1}, Ls6/i;->b()Z

    iget-object p1, p0, LG7/v$c$b$a$a$a;->q:Ls6/i;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ls6/i;->c(Z)V

    iget-object p1, p0, LG7/v$c$b$a$a$a;->r:Landroidx/cardview/widget/CardView;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .registers 2

    const-string p0, "v"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
