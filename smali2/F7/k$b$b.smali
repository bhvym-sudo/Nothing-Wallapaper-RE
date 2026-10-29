.class public final LF7/k$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF7/k$b;-><init>(Le3/z0;Lcom/android/launcher3/f;LE7/S;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Le3/z0;

.field final synthetic b:LF7/k$b;


# direct methods
.method public constructor <init>(Le3/z0;LF7/k$b;)V
    .registers 3

    iput-object p1, p0, LF7/k$b$b;->a:Le3/z0;

    iput-object p2, p0, LF7/k$b$b;->b:LF7/k$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p1, p0, LF7/k$b$b;->a:Le3/z0;

    iget-object p2, p1, Le3/z0;->y:Lcom/nothing/widget/ui/NtSwitch;

    new-instance p3, LF7/k$b$a;

    iget-object p0, p0, LF7/k$b$b;->b:LF7/k$b;

    invoke-direct {p3, p1, p0}, LF7/k$b$a;-><init>(Le3/z0;LF7/k$b;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
