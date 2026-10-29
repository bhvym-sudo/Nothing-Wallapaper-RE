.class public final synthetic LM6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:LM6/k$d;

.field public final synthetic b:LJ6/i;


# direct methods
.method public synthetic constructor <init>(LM6/k$d;LJ6/i;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/n;->a:LM6/k$d;

    iput-object p2, p0, LM6/n;->b:LJ6/i;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .registers 3

    iget-object v0, p0, LM6/n;->a:LM6/k$d;

    iget-object p0, p0, LM6/n;->b:LJ6/i;

    invoke-static {v0, p0, p1}, LM6/k$d;->f(LM6/k$d;LJ6/i;Landroid/view/View;)Z

    move-result p0

    return p0
.end method
