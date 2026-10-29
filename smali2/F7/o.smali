.class public final synthetic LF7/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:LF7/p$a;

.field public final synthetic b:Le3/H0;


# direct methods
.method public synthetic constructor <init>(LF7/p$a;Le3/H0;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF7/o;->a:LF7/p$a;

    iput-object p2, p0, LF7/o;->b:Le3/H0;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .registers 3

    iget-object v0, p0, LF7/o;->a:LF7/p$a;

    iget-object p0, p0, LF7/o;->b:Le3/H0;

    invoke-static {v0, p0, p1}, LF7/p$a;->d(LF7/p$a;Le3/H0;Landroid/view/View;)Z

    move-result p0

    return p0
.end method
