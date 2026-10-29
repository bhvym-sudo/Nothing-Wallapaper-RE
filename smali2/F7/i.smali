.class public final synthetic LF7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:LF7/j$a;

.field public final synthetic b:LC7/a;


# direct methods
.method public synthetic constructor <init>(LF7/j$a;LC7/a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF7/i;->a:LF7/j$a;

    iput-object p2, p0, LF7/i;->b:LC7/a;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .registers 3

    iget-object v0, p0, LF7/i;->a:LF7/j$a;

    iget-object p0, p0, LF7/i;->b:LC7/a;

    invoke-static {v0, p0, p1}, LF7/j$a;->e(LF7/j$a;LC7/a;Landroid/view/View;)Z

    move-result p0

    return p0
.end method
